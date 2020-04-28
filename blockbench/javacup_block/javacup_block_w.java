Stream.of(
Block.makeCuboidShape(6.777777777777779, 1, 6.888888888888886, 8.777777777777779, 3, 8.888888888888888),
Block.makeCuboidShape(7.777777777777779, 1, 3.8888888888888857, 8.777777777777779, 3, 4.888888888888886),
Block.makeCuboidShape(7.777777777777779, 3, 3.8888888888888857, 8.777777777777779, 4, 5.888888888888886),
Block.makeCuboidShape(7.777777777777779, 0, 3.8888888888888857, 8.777777777777779, 1, 5.888888888888886),
Block.makeCuboidShape(6.777777777777779, 1, 8.888888888888888, 8.777777777777779, 4, 9.888888888888888),
Block.makeCuboidShape(6.777777777777779, 1, 5.888888888888886, 8.777777777777779, 4, 6.888888888888886),
Block.makeCuboidShape(5.777777777777779, 1, 5.888888888888886, 6.777777777777779, 4, 9.888888888888888),
Block.makeCuboidShape(8.777777777777779, 1, 5.888888888888886, 9.77777777777778, 4, 9.888888888888888),
Block.makeCuboidShape(5.777777777777779, 0, 5.888888888888886, 9.777777777777779, 1, 9.888888888888888)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});