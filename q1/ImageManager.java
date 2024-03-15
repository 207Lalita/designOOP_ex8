public class ImageManager {
    private StrategyDesign renderer;
    public void setRenderer(StrategyDesign renderer) {
		this.renderer = renderer;
	}

	public void show() {

		renderer.showImage();
	}

}

