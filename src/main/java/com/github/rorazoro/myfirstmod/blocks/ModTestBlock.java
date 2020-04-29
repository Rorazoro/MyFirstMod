package com.github.rorazoro.myfirstmod.blocks;

import com.github.rorazoro.myfirstmod.init.TileEntityTypeInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class ModTestBlock extends Block {
    private static final VoxelShape SHAPE_N = Block.makeCuboidShape(5, 0, 5, 11, 7, 11);

    public ModTestBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_N;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypeInit.TEST_TILE_ENTITY.get().create();
    }
}