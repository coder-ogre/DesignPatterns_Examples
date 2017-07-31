
public class Client {
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = new YellowThemeScrollBar();
        Window window = new YellowThemeWindow();

        initializeGUI(bar,window);


        bar = new YellowThemeScrollBar();
        window = new PinkThemeWindow();

        initializeGUI(bar, window);

		
	}
}
