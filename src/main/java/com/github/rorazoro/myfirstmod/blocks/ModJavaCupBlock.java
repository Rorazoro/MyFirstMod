package com.github.rorazoro.myfirstmod.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ModJavaCupBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(Block.makeCuboidShape(7, 1, 7, 9, 3, 9),
            Block.makeCuboidShape(4, 1, 7, 5, 3, 8), Block.makeCuboidShape(4, 3, 7, 6, 4, 8),
            Block.makeCuboidShape(4, 0, 7, 6, 1, 8), Block.makeCuboidShape(9, 1, 7, 10, 4, 9),
            Block.makeCuboidShape(6, 1, 7, 7, 4, 9), Block.makeCuboidShape(6, 1, 9, 10, 4, 10),
            Block.makeCuboidShape(6, 1, 6, 10, 4, 7), Block.makeCuboidShape(6, 0, 6, 10, 1, 10)).reduce((v1, v2) -> {
                return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
            }).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6.888888888888889, 1, 6.666666666666666, 8.888888888888891, 3, 8.666666666666666),
            Block.makeCuboidShape(10.888888888888891, 1, 7.666666666666666, 11.888888888888891, 3, 8.666666666666666),
            Block.makeCuboidShape(9.888888888888891, 3, 7.666666666666666, 11.888888888888891, 4, 8.666666666666666),
            Block.makeCuboidShape(9.888888888888891, 0, 7.666666666666666, 11.888888888888891, 1, 8.666666666666666),
            Block.makeCuboidShape(5.888888888888889, 1, 6.666666666666666, 6.888888888888889, 4, 8.666666666666666),
            Block.makeCuboidShape(8.888888888888891, 1, 6.666666666666666, 9.888888888888891, 4, 8.666666666666666),
            Block.makeCuboidShape(5.888888888888889, 1, 5.666666666666666, 9.888888888888891, 4, 6.666666666666666),
            Block.makeCuboidShape(5.888888888888889, 1, 8.666666666666666, 9.888888888888891, 4, 9.666666666666668),
            Block.makeCuboidShape(5.888888888888889, 0, 5.666666666666666, 9.888888888888891, 1, 9.666666666666666))
            .reduce((v1, v2) -> {
                return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
            }).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(7.111111111111111, 1, 6.777777777777778, 9.11111111111111, 3, 8.777777777777779),
            Block.makeCuboidShape(7.111111111111111, 1, 10.777777777777779, 8.11111111111111, 3, 11.777777777777779),
            Block.makeCuboidShape(7.111111111111111, 3, 9.777777777777779, 8.11111111111111, 4, 11.777777777777779),
            Block.makeCuboidShape(7.111111111111111, 0, 9.777777777777779, 8.11111111111111, 1, 11.777777777777779),
            Block.makeCuboidShape(7.111111111111111, 1, 5.777777777777777, 9.11111111111111, 4, 6.777777777777777),
            Block.makeCuboidShape(7.111111111111111, 1, 8.777777777777779, 9.11111111111111, 4, 9.777777777777779),
            Block.makeCuboidShape(9.11111111111111, 1, 5.777777777777777, 10.11111111111111, 4, 9.777777777777779),
            Block.makeCuboidShape(6.111111111111109, 1, 5.777777777777777, 7.111111111111111, 4, 9.777777777777779),
            Block.makeCuboidShape(6.111111111111111, 0, 5.777777777777777, 10.11111111111111, 1, 9.777777777777779))
            .reduce((v1, v2) -> {
                return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
            }).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(6.777777777777779, 1, 6.888888888888886, 8.777777777777779, 3, 8.888888888888888),
            Block.makeCuboidShape(7.777777777777779, 1, 3.8888888888888857, 8.777777777777779, 3, 4.888888888888886),
            Block.makeCuboidShape(7.777777777777779, 3, 3.8888888888888857, 8.777777777777779, 4, 5.888888888888886),
            Block.makeCuboidShape(7.777777777777779, 0, 3.8888888888888857, 8.777777777777779, 1, 5.888888888888886),
            Block.makeCuboidShape(6.777777777777779, 1, 8.888888888888888, 8.777777777777779, 4, 9.888888888888888),
            Block.makeCuboidShape(6.777777777777779, 1, 5.888888888888886, 8.777777777777779, 4, 6.888888888888886),
            Block.makeCuboidShape(5.777777777777779, 1, 5.888888888888886, 6.777777777777779, 4, 9.888888888888888),
            Block.makeCuboidShape(8.777777777777779, 1, 5.888888888888886, 9.77777777777778, 4, 9.888888888888888),
            Block.makeCuboidShape(5.777777777777779, 0, 5.888888888888886, 9.777777777777779, 1, 9.888888888888888))
            .reduce((v1, v2) -> {
                return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
            }).get();

    public ModJavaCupBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;

            case SOUTH:
                return SHAPE_S;

            case EAST:
                return SHAPE_E;

            case WEST:
                return SHAPE_W;

            default:
                return SHAPE_N;
        }
    }
}