package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=SnapshotInfo, data={id=str, name=str, vm-state-size=int, date-sec=int, date-nsec=int, vm-clock-sec=int, vm-clock-nsec=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=SnapshotInfo, data={id=str, name=str, vm-state-size=int, date-sec=int, date-nsec=int, vm-clock-sec=int, vm-clock-nsec=int}, innerTypes=null}
public class SnapshotInfo extends QApiType {

	@SerializedName("id")
	@Nonnull
	public java.lang.String id;
	@SerializedName("name")
	@Nonnull
	public java.lang.String name;
	@SerializedName("vm-state-size")
	@Nonnull
	public long vmStateSize;
	@SerializedName("date-sec")
	@Nonnull
	public long dateSec;
	@SerializedName("date-nsec")
	@Nonnull
	public long dateNsec;
	@SerializedName("vm-clock-sec")
	@Nonnull
	public long vmClockSec;
	@SerializedName("vm-clock-nsec")
	@Nonnull
	public long vmClockNsec;

	public SnapshotInfo() {
	}

	public SnapshotInfo(java.lang.String id, java.lang.String name, long vmStateSize, long dateSec, long dateNsec, long vmClockSec, long vmClockNsec) {
		this.id = id;
		this.name = name;
		this.vmStateSize = vmStateSize;
		this.dateSec = dateSec;
		this.dateNsec = dateNsec;
		this.vmClockSec = vmClockSec;
		this.vmClockNsec = vmClockNsec;
	}
}