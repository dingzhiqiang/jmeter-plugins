package kg.apc.jmeter.vizualizers;

import kg.apc.jmeter.util.TestJMeterUtils;
import org.apache.jmeter.samplers.SampleResult;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stéphane Hoblingre
 */
public class BytesThroughputOverTimeGuiTest {

    public BytesThroughputOverTimeGuiTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        TestJMeterUtils.createJmeterEnv();
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getLabelResource method, of class BytesThroughputOverTimeGui.
     */
    @Test
    public void testGetLabelResource()
    {
        System.out.println("getLabelResource");
        BytesThroughputOverTimeGui instance = new BytesThroughputOverTimeGui();
        String expResult = "BytesThroughputOverTimeGui";
        String result = instance.getLabelResource();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStaticLabel method, of class BytesThroughputOverTimeGui.
     */
    @Test
    public void testGetStaticLabel()
    {
        System.out.println("getStaticLabel");
        BytesThroughputOverTimeGui instance = new BytesThroughputOverTimeGui();
        String expResult = "Bytes Throughput Over Time";
        String result = instance.getStaticLabel();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class BytesThroughputOverTimeGui.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        SampleResult res = new SampleResult();
        res.setAllThreads(1);
        res.setThreadName("test 1-2");
        res.setBytes(1234);
        BytesThroughputOverTimeGui instance = new BytesThroughputOverTimeGui();
        instance.add(res);
        res.sampleStart();
        try
        {
            Thread.sleep(10);
        } catch (InterruptedException ex)
        {
        }
        res.sampleEnd();
        instance.add(res);
    }

    /**
     * Test of getSettingsPanel method, of class BytesThroughputOverTimeGui.
     */
    @Test
    public void testGetSettingsPanel()
    {
        System.out.println("getSettingsPanel");
        BytesThroughputOverTimeGui instance = new BytesThroughputOverTimeGui();
        JSettingsPanel result = instance.getSettingsPanel();
        assertNotNull(result);
    }

}