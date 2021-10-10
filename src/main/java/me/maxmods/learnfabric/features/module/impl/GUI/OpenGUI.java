package me.maxmods.learnfabric.features.module.impl.GUI;

import me.maxmods.learnfabric.features.gui.TestGUI;
import me.maxmods.learnfabric.features.module.Module;
import me.maxmods.learnfabric.features.module.ModuleRegistry;
import me.maxmods.learnfabric.features.module.impl.Categories.GUI;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class OpenGUI extends Module {
    int i = 0;
    boolean turnedOn = false;
    public OpenGUI(){
        super("OpenGui", ModuleRegistry.getInstance().getCategoryByName("GUI"), ": Open the gui");
    }

    @Override
    protected void enable(){

    }

    @Override
    protected void disable() {
        turnedOn = false;
    }

    @Override
    public void tick() {
        MinecraftClient instance = MinecraftClient.getInstance();
        i++;
        if (i > 2) {
            i = 0;
            setEnabled(false);
            instance.setScreen(new TestGUI());

        }
    }

    @Override
    public void renderWorld(MatrixStack stack) {

    }

    @Override
    public void renderHud() {

    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }
}