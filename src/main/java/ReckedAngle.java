/**
 * Created by Guest on 1/3/18.
 */
public class ReckedAngle {

    private int haight;
    private int withe;

    public ReckedAngle(int haight, int withe) {
        this.haight = haight;
        this.withe = withe;
    }

    public int getHaight(){
        return this.haight;
    }

    public int getWithe() {
        return this.withe;
    }

    public boolean isSquare() {
        return haight == withe;
    }
}
