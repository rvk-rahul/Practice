package practice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Objects;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class EventAttribute implements Serializable {

	private static final long serialVersionUID = 1L;

	private int attributeIdRef;
	
	private String eventAttributeValue;

	private boolean bool;

	public int getAttributeIdRef() {
		return attributeIdRef;
	}

	public void setAttributeIdRef(int attributeIdRef) {
		this.attributeIdRef = attributeIdRef;
	}

	public String getEventAttributeValue() {
		return eventAttributeValue;
	}

	public void setEventAttributeValue(String eventAttributeValue) {
		this.eventAttributeValue = eventAttributeValue;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public EventAttribute() {
		setAttributeIdRef(1);
		setEventAttributeValue("Hallo");
		setBool(false);
	}

	public EventAttribute(String eventAttributeValue) {
		setEventAttributeValue(eventAttributeValue);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EventAttribute that = (EventAttribute) o;
		return attributeIdRef == that.attributeIdRef &&
				Objects.equals(eventAttributeValue, that.eventAttributeValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(attributeIdRef, eventAttributeValue);
	}
}
