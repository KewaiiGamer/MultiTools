package info.kewaiigamer.multitools;

/**
 * Created by KewaiiGamer on 6/13/17.
 */
public class ConfigValue {

    public String name = null;
    public Boolean value = false;

    public ConfigValue(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
