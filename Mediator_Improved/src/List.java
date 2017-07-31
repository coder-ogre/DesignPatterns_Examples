import java.util.ArrayList;

public class List {
	private java.util.List<String> items = new ArrayList<String>();


    private ScreenDirector screendirector;


    public void selectItem(int itemNumber){
        String item = items.get(itemNumber);
        if(screendirector !=null){
            screendirector.itemSelected(item);
        }
    }


    public java.util.List<String> getItems() {
        return items;
    }


    public void setScreendirector(ScreenDirector screendirector) {
        this.screendirector = screendirector;
    }
}
