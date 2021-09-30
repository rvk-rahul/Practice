package practice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	private int eventId;

	private TempEnum eventType;

	private String eventName;

	private final List<EventAttribute> eventAttributes = new ArrayList();

	public Event(Event event) {
	}

	public Event() {
	}

	public Event(int eventId, String eventName) {
		setEventId(eventId);
		setEventName(eventName);
		setEventType(TempEnum.Standard);
	}

	public List<EventAttribute> getEventAttributes() {
		return eventAttributes;
	}

	public void setEventAttributes(List<EventAttribute> eventAttributes) {
		if (this.eventAttributes != eventAttributes) {
			//this.eventAttributes.clear();
			if (eventAttributes != null)
				this.eventAttributes.addAll(eventAttributes);
		}
	}
	
	public EventAttribute addEventAttribute(EventAttribute eventAttribute) {
		getEventAttributes().add(eventAttribute);

		return eventAttribute;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public TempEnum getEventType() {
		return eventType;
	}

	public void setEventType(TempEnum eventType) {
		this.eventType = eventType;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}
