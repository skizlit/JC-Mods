package skizlit.jcmods.common.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import skizlit.jcmods.common.JCModsBlocks;

public class JCModsWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			generateOverworld(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(JCModsBlocks.ORE_NICKEL.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 5, 64, rand.nextInt(10) + 4, 12);
		generateOre(JCModsBlocks.ORE_RHODIUM.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 5, 30, rand.nextInt(7) + 4, 9);
		generateOre(JCModsBlocks.ORE_TANZANITE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 5, 20, rand.nextInt(8) + 4, 10);
	}
	
	private void generateOre(IBlockState state, World world, Random rand, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + rand.nextInt(16), minY + rand.nextInt(deltaY), z + rand.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(state, size);
			generator.generate(world, rand, pos);
		}
	}
}
