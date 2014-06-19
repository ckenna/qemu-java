package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=ChardevBackend, data={file=ChardevFile, serial=ChardevHostdev, parallel=ChardevHostdev, pipe=ChardevHostdev, socket=ChardevSocket, udp=ChardevUdp, pty=ChardevDummy, null=ChardevDummy, mux=ChardevMux, msmouse=ChardevDummy, braille=ChardevDummy, stdio=ChardevStdio, console=ChardevDummy, spicevmc=ChardevSpiceChannel, spiceport=ChardevSpicePort, vc=ChardevVC, ringbuf=ChardevRingbuf, memory=ChardevRingbuf}, innerTypes=null, fields=null}
public class ChardevBackend extends QApiUnion {
	@SerializedName("file")
	@Nonnull public ChardevFile file;
	@SerializedName("serial")
	@Nonnull public ChardevHostdev serial;
	@SerializedName("parallel")
	@Nonnull public ChardevHostdev parallel;
	@SerializedName("pipe")
	@Nonnull public ChardevHostdev pipe;
	@SerializedName("socket")
	@Nonnull public ChardevSocket socket;
	@SerializedName("udp")
	@Nonnull public ChardevUdp udp;
	@SerializedName("pty")
	@Nonnull public ChardevDummy pty;
	@SerializedName("null")
	@Nonnull public ChardevDummy _null;
	@SerializedName("mux")
	@Nonnull public ChardevMux mux;
	@SerializedName("msmouse")
	@Nonnull public ChardevDummy msmouse;
	@SerializedName("braille")
	@Nonnull public ChardevDummy braille;
	@SerializedName("stdio")
	@Nonnull public ChardevStdio stdio;
	@SerializedName("console")
	@Nonnull public ChardevDummy console;
	@SerializedName("spicevmc")
	@Nonnull public ChardevSpiceChannel spicevmc;
	@SerializedName("spiceport")
	@Nonnull public ChardevSpicePort spiceport;
	@SerializedName("vc")
	@Nonnull public ChardevVC vc;
	@SerializedName("ringbuf")
	@Nonnull public ChardevRingbuf ringbuf;
	@SerializedName("memory")
	@Nonnull public ChardevRingbuf memory;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (file != null)
			count++;
		if (serial != null)
			count++;
		if (parallel != null)
			count++;
		if (pipe != null)
			count++;
		if (socket != null)
			count++;
		if (udp != null)
			count++;
		if (pty != null)
			count++;
		if (_null != null)
			count++;
		if (mux != null)
			count++;
		if (msmouse != null)
			count++;
		if (braille != null)
			count++;
		if (stdio != null)
			count++;
		if (console != null)
			count++;
		if (spicevmc != null)
			count++;
		if (spiceport != null)
			count++;
		if (vc != null)
			count++;
		if (ringbuf != null)
			count++;
		if (memory != null)
			count++;
		return (count == 1);
	}
}
