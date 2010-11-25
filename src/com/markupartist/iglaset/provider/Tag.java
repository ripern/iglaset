package com.markupartist.iglaset.provider;

import android.os.Parcel;
import android.os.Parcelable;

public class Tag implements Parcelable {
	
	public static final int UNDEFINED_ID = -1;

	private int id;
	private String type;
	private String name;
	
	public Tag() {
		id = UNDEFINED_ID;
	}
	
    public Tag(Parcel in) {
        id = in.readInt();
        type = in.readString();
        name = in.readString();
    }
    
	@Override
	public void writeToParcel(Parcel parcel, int flags) {
		parcel.writeInt(id);
		parcel.writeString(type);
		parcel.writeString(name);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public String toString() {
		return this.name;
	}

	@Override
	public int describeContents() {
		return 0;
	}
}
