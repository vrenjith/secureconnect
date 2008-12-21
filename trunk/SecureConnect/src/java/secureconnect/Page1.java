/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package secureconnect;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Listbox;
import com.sun.webui.jsf.component.TextField;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.FacesException;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Page1.java
 * @version Created on Dec 20, 2008, 6:19:27 PM
 * @author Z000DG8C
 */

public class Page1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        employeeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.employeeRowSet}"));
        employeeDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.employeeRowSet1}"));
    }
    private TextField textField1 = new TextField();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }
    private Listbox listbox1 = new Listbox();

    public Listbox getListbox1() {
        return listbox1;
    }

    public void setListbox1(Listbox l) {
        this.listbox1 = l;
    }
    private CachedRowSetDataProvider employeeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getEmployeeDataProvider() {
        return employeeDataProvider;
    }

    public void setEmployeeDataProvider(CachedRowSetDataProvider crsdp) {
        this.employeeDataProvider = crsdp;
    }
    private CachedRowSetDataProvider employeeDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getEmployeeDataProvider1() {
        return employeeDataProvider1;
    }

    public void setEmployeeDataProvider1(CachedRowSetDataProvider crsdp) {
        this.employeeDataProvider1 = crsdp;
    }
    private IntegerConverter listbox1Converter = new IntegerConverter();

    public IntegerConverter getListbox1Converter() {
        return listbox1Converter;
    }

    public void setListbox1Converter(IntegerConverter ic) {
        this.listbox1Converter = ic;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Page1() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
        if (textField1.getText() == null || textField1.getText().toString().length() == 0) {
            listbox1.setVisible(false);
            try {
                getSessionBean1().getEmployeeRowSet().setObject(1, "");
            } catch (SQLException ex) {
                Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        employeeDataProvider.close();
        employeeDataProvider1.close();
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

public void textField1_processValueChange(ValueChangeEvent event) {
        if (textField1.getText().toString() != null || textField1.getText().toString().length() >  0) {
            listbox1.setVisible(true);
        }
        String prefix = textField1.getText().toString();
        String doctName = prefix.substring(0, 1).toUpperCase() + prefix.substring(1) + '%';
        try {
            getSessionBean1().getEmployeeRowSet().setObject(1, doctName);
            employeeDataProvider.refresh();
        } catch (SQLException ex) {
            Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
        }
                        }
}

