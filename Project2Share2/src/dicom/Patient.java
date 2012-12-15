package dicom;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Patient {
  private String name;
	private int id;
	private Date dateOfBirth;

	/**
   * Name includes first and last name
   * must follow HL7 specification
   */
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Calculates Age from birthDate (instance variable)
	 * @return the age of the patient in years
	 */
	public int getAge() {
		Calendar dob = new GregorianCalendar();
		dob.setTime(dateOfBirth);
		Calendar now = new GregorianCalendar();
		int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		//TODO: If-Abfrage vereinfachen
		if ((dob.get(Calendar.MONTH) > now.get(Calendar.MONTH))
				|| (dob.get(Calendar.MONTH) == now.get(Calendar.MONTH) 
				&& dob.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}
		return age;
	}

}
