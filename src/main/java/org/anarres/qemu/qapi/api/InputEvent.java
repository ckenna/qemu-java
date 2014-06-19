package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=InputEvent, data={key=InputKeyEvent, btn=InputBtnEvent, rel=InputMoveEvent, abs=InputMoveEvent}, innerTypes=null, fields=null}
public class InputEvent extends QApiUnion {
	@SerializedName("key")
	@Nonnull public InputKeyEvent key;
	@SerializedName("btn")
	@Nonnull public InputBtnEvent btn;
	@SerializedName("rel")
	@Nonnull public InputMoveEvent rel;
	@SerializedName("abs")
	@Nonnull public InputMoveEvent abs;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (key != null)
			count++;
		if (btn != null)
			count++;
		if (rel != null)
			count++;
		if (abs != null)
			count++;
		return (count == 1);
	}
}
