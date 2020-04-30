package com.github.rorazoro.myfirstmod.blocks;

import com.github.rorazoro.myfirstmod.init.TileEntityTypeInit;
import com.github.rorazoro.myfirstmod.tileentities.SpottedStoneChestTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class SpottedStoneChestBlock extends Block {

    public SpottedStoneChestBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypeInit.SPOTTEDSTONE_CHEST_TILE_ENTITY.get().create();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
            Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof SpottedStoneChestTileEntity) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (SpottedStoneChestTileEntity) tileEntity, pos);
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof SpottedStoneChestTileEntity) {
                InventoryHelper.dropItems(worldIn, pos, ((SpottedStoneChestTileEntity) tileEntity).getItems());
            }
        }
    }
}