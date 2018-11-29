package info.kewaiigamer.multitools.enums;

public enum EnumVanillaMaterial {
    WOOD("wood"),
    STONE("stone"),
    IRON("iron"),
    GOLD("gold"),
    DIAMOND("diamond");

    public final String suffix;

    EnumVanillaMaterial(String suffix) {
        this.suffix = suffix;
    }
}