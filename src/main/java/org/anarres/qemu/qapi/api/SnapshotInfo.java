package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=SnapshotInfo, data={id=str, name=str, vm-state-size=int, date-sec=int, date-nsec=int, vm-clock-sec=int, vm-clock-nsec=int}, innerTypes=null, fields=null}
public class SnapshotInfo extends QApiType {

	@SerializedName("id")
	@Nonnull public String id;
	@SerializedName("name")
	@Nonnull public String name;
	@SerializedName("vm-state-size")
	@Nonnull public long vmStateSize;
	@SerializedName("date-sec")
	@Nonnull public long dateSec;
	@SerializedName("date-nsec")
	@Nonnull public long dateNsec;
	@SerializedName("vm-clock-sec")
	@Nonnull public long vmClockSec;
	@SerializedName("vm-clock-nsec")
	@Nonnull public long vmClockNsec;
}
