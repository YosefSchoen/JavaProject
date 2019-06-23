package Elements;

import Primitives.Point3d;

import java.awt.Color;

public abstract class Light {
    protected Color color;

    public Light() {
        // Create a new color for the light, default white
        color = new Color(255, 255, 255);
    }

    public Light(int r, int g, int b) {
        // Use the passed color
        this.color = new Color(r, g, b);
    }

    public Light(Color color) {
        // Use the passed color
        this.color = color;
    }

    public Light(Light other) {
        // Use the color of the passed light
        color = other.color;
    }

    public Color getColor() {
        return new Color(color.getRed(), color.getGreen(), color.getBlue());
    }

    public void setColor(Color color) {
        this.color = new Color(color.getRed(), color.getGreen(), color.getBlue());
    }

    public abstract Color getIntensity(Point3d P);

    /**
     * return val clamped to the range [0, 1]
     * @param val any double value
     * @return a value in the range [0, 1]
     */
    public static double clamp(double val){
        if (val < 0.0) {
            return 0.0;
        }

        if (val > 1.0) {
            return 1.0;
        }

        return val;
    }

    /**
     * return val clamped to the range [0, 255]
     * @param val any int value
     * @return a value in the range [0, 255]
     */
    public static int clamp(int val){
        if (val < 0) {
            return 0;
        }

        if (val > 255) {
            return 255;
        }

        return val;
    }
}
