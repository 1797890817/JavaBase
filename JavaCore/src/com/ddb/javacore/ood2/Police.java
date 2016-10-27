package com.ddb.javacore.ood2;

public class Police extends Human {

	private String id;
	private String name;
	private Integer age;
	private String work;

	
	public Police() {
		super();
	}

	public Police(String id, String name, Integer age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the work
	 */
	public String getWork() {
		return work;
	}

	/**
	 * @param work
	 *            the work to set
	 */
	public void setWork(String work) {
		this.work = work;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Police)) {
			return false;
		}
		
		Police other = (Police) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Police police1 = new Police("ID-123456", "zhangsan", 36, "Worker");
		Police police2 = new Police("ID-123456", "zhangsan", 36, "Worker");
		Police police3 = new Police("ID-123455", "zhangsan", 36, "Worker");
		Police police4;

		if (police1 == police2) {
			System.out.println("police1 == police2 :" + (police1 == police2));

		} else {
			System.out.println("police1 != police2 :" + (police1 != police2));
			System.out.println("police1 : " + police1);
			System.out.println("police2 : " + police2);

		}

		if (police1.equals(police2)) {
			System.out.println("police1.equals(police2) :" + (police1.equals(police2)));
		} else {
			System.out.println(" !police1.equals(police2) :" + (!police1.equals(police2)));
		}

		if (police1.equals(police3)) {
			System.out.println("police1.equals(police3) :" + (police1.equals(police3)));
		} else {
			System.out.println(" !police1.equals(police3) :" + (!police1.equals(police3)));
		}

		police4 = police3;
		System.out.println("police3 : " + police3);
		System.out.println("police4 : " + police4);
		police4.setId("ID--36987");
		System.out.println("修改了 police4 的ID属性: ");
		System.out.println("police3 : " + police3);
		System.out.println("police4 : " + police4);
		
		Human human1 = new Human();
		human1.setId("ID---0001");
		System.out.println(human1);
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Police [id=" + id + ", name=" + name + "]";
	}

}
