package talonos.blightbuster;

import cpw.mods.fml.common.registry.GameRegistry;
import talonos.blightbuster.tileentity.DawnChargerTileEntity;
import talonos.blightbuster.tileentity.DawnMachineSpoutTileEntity;
import talonos.blightbuster.tileentity.DawnMachineTileEntity;
import talonos.blightbuster.tileentity.DawnTotemEntity;
import talonos.blightbuster.tileentity.NodeResetterTileEntity;
import talonos.blightbuster.tileentity.TileEntityChestFinder;

public class CommonProxy {
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(DawnTotemEntity.class, "DawnTotemEntity");
		GameRegistry.registerTileEntity(DawnMachineSpoutTileEntity.class, "DawnMachineSpout");
		GameRegistry.registerTileEntity(DawnMachineTileEntity.class, "DawnMachine");
		GameRegistry.registerTileEntity(DawnChargerTileEntity.class, "DawnCharger");
		GameRegistry.registerTileEntity(TileEntityChestFinder.class, "ChestFinder");
		GameRegistry.registerTileEntity(NodeResetterTileEntity.class, "NodeResetter");
	}

	public void registerRenderers() {}

	public double getBestCleanseSpawnHeight() { return 0; }
}
