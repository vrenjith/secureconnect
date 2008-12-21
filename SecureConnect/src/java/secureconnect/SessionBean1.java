/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package secureconnect;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import javax.faces.FacesException;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @version SessionBean1.java
 * @version Created on Dec 20, 2008, 6:19:27 PM
 * @author Z000DG8C
 */

public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        employeeRowSet.setDataSourceName("java:comp/env/jdbc/VIR_ApacheDerby");
        employeeRowSet.setCommand("SELECT ALL VIR.EMPLOYEE.ID, VIR.EMPLOYEE.FIRSTNAME, VIR.EMPLOYEE.LASTNAME, VIR.EMPLOYEE.EMAIL  FROM VIR.EMPLOYEE WHERE VIR.EMPLOYEE.FIRSTNAME  LIKE  ?");
        employeeRowSet.setTableName("EMPLOYEE");
        employeeRowSet1.setDataSourceName("java:comp/env/jdbc/VIR_ApacheDerby");
        employeeRowSet1.setCommand("SELECT ALL VIR.EMPLOYEE.ID, VIR.EMPLOYEE.FIRSTNAME, VIR.EMPLOYEE.LASTNAME, VIR.EMPLOYEE.EMAIL  FROM VIR.EMPLOYEE WHERE VIR.EMPLOYEE.ID = ?");
        employeeRowSet1.setTableName("EMPLOYEE");
    }
    private CachedRowSetXImpl employeeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getEmployeeRowSet() {
        return employeeRowSet;
    }

    public void setEmployeeRowSet(CachedRowSetXImpl crsxi) {
        this.employeeRowSet = crsxi;
    }
    private CachedRowSetXImpl employeeRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getEmployeeRowSet1() {
        return employeeRowSet1;
    }

    public void setEmployeeRowSet1(CachedRowSetXImpl crsxi) {
        this.employeeRowSet1 = crsxi;
    }
    // </editor-fold>

    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }

    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
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
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

}
