Stream.of(
Block.makeCuboidShape(7, 1, 7, 9, 3, 9),
Block.makeCuboidShape(4, 1, 7, 5, 3, 8),
Block.makeCuboidShape(4, 3, 7, 6, 4, 8),
Block.makeCuboidShape(4, 0, 7, 6, 1, 8),
Block.makeCuboidShape(9, 1, 7, 10, 4, 9),
Block.makeCuboidShape(6, 1, 7, 7, 4, 9),
Block.makeCuboidShape(6, 1, 9, 10, 4, 10),
Block.makeCuboidShape(6, 1, 6, 10, 4, 7),
Block.makeCuboidShape(6, 0, 6, 10, 1, 10)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});