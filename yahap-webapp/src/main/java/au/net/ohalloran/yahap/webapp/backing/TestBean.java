package au.net.ohalloran.yahap.webapp.backing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestBean {

	private static final Log LOG = LogFactory.getLog(TestBean.class);

	private String basicInput = "";

	private Date basicDate = new Date();
	
	private Date basicTime = new Date();

	private String lastAction;

	public String getBasicInput() {
		return basicInput;
	}

	  public Date getBasicDate() {
		    return basicDate;
	  }

	  public void setBasicDate(Date basicDate) {
	    this.basicDate = basicDate;
	  }

	  public Date getBasicTime() {
	    return basicTime;
	  }

	  public void setBasicTime(Date basicTime) {
	    this.basicTime = basicTime;
	  }

	public void setBasicInput(String basicInput) {
		this.basicInput = basicInput;
	}

    public List<String> getInputSuggestItems(String prefix) {
        LOG.info("createing items for prefix :\"" + prefix + "\"");
        List<String> li = new ArrayList<String>();
        li.add(prefix+1);
        li.add(prefix+2);
        li.add(prefix+3);
        li.add(prefix+4);
        li.add(prefix+5);
        li.add(prefix+6);
        return li;
      }

    public void click(ActionEvent actionEvent) {
        lastAction = actionEvent.getComponent().getId();
      }
}
