package skizlit.jcmods.common.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import skizlit.jcmods.common.util.Refrences;

public class JCModsWorldGen implements IWorldGenerator{
	
	private WorldGenerator ore_Cerium, ore_End_Cerium, ore_Nether_Cerium;
	private WorldGenerator ore_Rhodium, ore_End_Rhodium, ore_Nether_Rhodium;
	private WorldGenerator ore_Tanzanite, ore_End_Tanzanite, ore_Nether_Tanzanite;
	
	public JCModsWorldGen() {
		ore_Cerium = new WorldGenMinable(Refrences.ORE_CERIUM.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_End_Cerium = new WorldGenMinable(Refrences.ORE_END_CERIUM.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_Nether_Cerium = new WorldGenMinable(Refrences.ORE_NETHER_CERIUM.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
		ore_Rhodium = new WorldGenMinable((IBlockState) Refrences.ORE_RHODIUM.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		ore_End_Rhodium = new WorldGenMinable((IBlockState) Refrences.ORE_END_RHODIUM.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_Nether_Rhodium = new WorldGenMinable((IBlockState) Refrences.ORE_NETHER_RHODIUM.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
		ore_Tanzanite = new WorldGenMinable((IBlockState) Refrences.ORE_TANZANITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		ore_End_Tanzanite = new WorldGenMinable((IBlockState) Refrences.ORE_END_TANZANITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_Nether_Tanzanite = new WorldGenMinable((IBlockState) Refrences.ORE_NETHER_TANZANITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case -1:
			runGenerator(ore_Nether_Cerium, world, rand, chunkX, chunkZ, 16, 0, 256);
			runGenerator(ore_Nether_Rhodium, world, rand, chunkX, chunkZ, 7, 0, 40);
			runGenerator(ore_Nether_Tanzanite, world, rand, chunkX, chunkZ, 8, 0, 50);
			break;
		case 0:
			runGenerator(ore_Cerium, world, rand, chunkX, chunkZ, 16, 0, 125);
			runGenerator(ore_Rhodium, world, rand, chunkX, chunkZ, 7, 0, 16);
			runGenerator(ore_Tanzanite, world, rand, chunkX, chunkZ, 8, 0, 20);
			break;
		case 1:
			runGenerator(ore_End_Cerium, world, rand, chunkX, chunkZ, 16, 0, 256);
			runGenerator(ore_End_Rhodium, world, rand, chunkX, chunkZ, 7, 0, 256);
			runGenerator(ore_End_Tanzanite, world, rand, chunkX, chunkZ, 8, 0, 256);
			break;
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("ERROR: Ore generated out of bounds.");
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for (int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int z = chunkZ * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
