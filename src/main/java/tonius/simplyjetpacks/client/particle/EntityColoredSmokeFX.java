package tonius.simplyjetpacks.client.particle;

import java.awt.Color;

import net.minecraft.world.World;
import tonius.simplyjetpacks.util.ColorUtils;

public class EntityColoredSmokeFX extends EntityCustomSmokeFX {
    
    public EntityColoredSmokeFX(World world, double posX, double posY, double posZ, double velX, double velY, double velZ, float red, float green, float blue) {
        super(world, posX, posY, posZ, velX, velY, velZ);
        this.particleRed = red;
        this.particleGreen = green;
        this.particleBlue = blue;
    }
    
    public static EntityColoredSmokeFX getRainbowSmoke(World world, double posX, double posY, double posZ, double velX, double velY, double velZ) {
        Color color = ColorUtils.getRandomColor();
        float red = color.getRed() / 255.0F;
        float green = color.getGreen() / 255.0F;
        float blue = color.getBlue() / 255.0F;
        return new EntityColoredSmokeFX(world, posX, posY, posZ, velX, velY, velZ, red, green, blue);
    }
    
}
