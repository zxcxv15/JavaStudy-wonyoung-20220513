package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {

	private String schoolName; // 학교이름
	private String schoolAddress; //학교 주소
	private String schoolCurriculum; // 학교 교육 과정
	private LocalDate schoolAnniversary; //학교 기념일
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String schoolAddress, String schoolCurriculum, LocalDate schoolAnniversary) {
		super();
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolCurriculum = schoolCurriculum;
		this.schoolAnniversary = schoolAnniversary;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolCurriculum() {
		return schoolCurriculum;
	}

	public void setSchoolCurriculum(String schoolCurriculum) {
		this.schoolCurriculum = schoolCurriculum;
	}

	public LocalDate getSchoolAnniversary() {
		return schoolAnniversary;
	}

	public void setSchoolAnniversary(LocalDate schoolAnniversary) {
		this.schoolAnniversary = schoolAnniversary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolAddress, schoolAnniversary, schoolCurriculum, schoolName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolAddress, other.schoolAddress)
				&& Objects.equals(schoolAnniversary, other.schoolAnniversary)
				&& Objects.equals(schoolCurriculum, other.schoolCurriculum)
				&& Objects.equals(schoolName, other.schoolName);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + ", schoolCurriculum="
				+ schoolCurriculum + ", schoolAnniversary=" + schoolAnniversary + "]";
	}
	
	
}
