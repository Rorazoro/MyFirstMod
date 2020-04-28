Stream.of(
Block.makeCuboidShape(6.888888888888889, 1, 6.666666666666666, 8.888888888888891, 3, 8.666666666666666),
Block.makeCuboidShape(10.888888888888891, 1, 7.666666666666666, 11.888888888888891, 3, 8.666666666666666),
Block.makeCuboidShape(9.888888888888891, 3, 7.666666666666666, 11.888888888888891, 4, 8.666666666666666),
Block.makeCuboidShape(9.888888888888891, 0, 7.666666666666666, 11.888888888888891, 1, 8.666666666666666),
Block.makeCuboidShape(5.888888888888889, 1, 6.666666666666666, 6.888888888888889, 4, 8.666666666666666),
Block.makeCuboidShape(8.888888888888891, 1, 6.666666666666666, 9.888888888888891, 4, 8.666666666666666),
Block.makeCuboidShape(5.888888888888889, 1, 5.666666666666666, 9.888888888888891, 4, 6.666666666666666),
Block.makeCuboidShape(5.888888888888889, 1, 8.666666666666666, 9.888888888888891, 4, 9.666666666666668),
Block.makeCuboidShape(5.888888888888889, 0, 5.666666666666666, 9.888888888888891, 1, 9.666666666666666)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});