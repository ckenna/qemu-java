package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;
 
// QApiTypeDescriptor{name=ChardevHostdev, data={device=str}, innerTypes=null, fields=null}
public class ChardevHostdev extends QApiType {

	@SerializedName("device")
	@Nonnull public String device;
}
