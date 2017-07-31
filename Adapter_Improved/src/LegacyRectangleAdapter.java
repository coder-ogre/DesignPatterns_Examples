import java.awt.Rectangle;

public class LegacyRectangleAdapter extends Rectangle {
	private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    public Integer determineSize() {
        return legacyRectangle.calculateSize();
    }
}
