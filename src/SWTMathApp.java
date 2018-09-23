import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;

public class SWTMathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("4C SWT Math Assignment");
		
	    Spinner spinner = new Spinner(shell, SWT.BORDER);
	    spinner.setToolTipText("Gregs Spinner");
	    //spinner.setLocation(50, 50);
	    spinner.setMinimum(0);
	    spinner.setMaximum(20);
	    spinner.setSelection(10);
	    spinner.setIncrement(1);
	    spinner.setPageIncrement(5);
	    
	    
		spinner.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				Integer value = spinner.getSelection();
				spinner.setToolTipText("Value is: " + value.toString());
			}
		});
		
	    spinner.pack();

	    //shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
