package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=DriveBackup, data={*job-id=str, device=str, target=str, *format=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *bitmap=str, *compress=bool, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError, *auto-finalize=bool, *auto-dismiss=bool}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=DriveBackup, data={*job-id=str, device=str, target=str, *format=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *bitmap=str, *compress=bool, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError, *auto-finalize=bool, *auto-dismiss=bool}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DriveBackup extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("job-id")
	@CheckForNull
	public java.lang.String jobId;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("target")
	@Nonnull
	public java.lang.String target;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("format")
	@CheckForNull
	public java.lang.String format;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("sync")
	@Nonnull
	public MirrorSyncMode sync;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("mode")
	@CheckForNull
	public NewImageMode mode;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("speed")
	@CheckForNull
	public java.lang.Long speed;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bitmap")
	@CheckForNull
	public java.lang.String bitmap;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("compress")
	@CheckForNull
	public java.lang.Boolean compress;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("on-source-error")
	@CheckForNull
	public BlockdevOnError onSourceError;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("on-target-error")
	@CheckForNull
	public BlockdevOnError onTargetError;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("auto-finalize")
	@CheckForNull
	public java.lang.Boolean autoFinalize;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("auto-dismiss")
	@CheckForNull
	public java.lang.Boolean autoDismiss;

	@Nonnull
	public DriveBackup withJobId(java.lang.String value) {
		this.jobId = value;
		return this;
	}

	@Nonnull
	public DriveBackup withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public DriveBackup withTarget(java.lang.String value) {
		this.target = value;
		return this;
	}

	@Nonnull
	public DriveBackup withFormat(java.lang.String value) {
		this.format = value;
		return this;
	}

	@Nonnull
	public DriveBackup withSync(MirrorSyncMode value) {
		this.sync = value;
		return this;
	}

	@Nonnull
	public DriveBackup withMode(NewImageMode value) {
		this.mode = value;
		return this;
	}

	@Nonnull
	public DriveBackup withSpeed(java.lang.Long value) {
		this.speed = value;
		return this;
	}

	@Nonnull
	public DriveBackup withBitmap(java.lang.String value) {
		this.bitmap = value;
		return this;
	}

	@Nonnull
	public DriveBackup withCompress(java.lang.Boolean value) {
		this.compress = value;
		return this;
	}

	@Nonnull
	public DriveBackup withOnSourceError(BlockdevOnError value) {
		this.onSourceError = value;
		return this;
	}

	@Nonnull
	public DriveBackup withOnTargetError(BlockdevOnError value) {
		this.onTargetError = value;
		return this;
	}

	@Nonnull
	public DriveBackup withAutoFinalize(java.lang.Boolean value) {
		this.autoFinalize = value;
		return this;
	}

	@Nonnull
	public DriveBackup withAutoDismiss(java.lang.Boolean value) {
		this.autoDismiss = value;
		return this;
	}

	public DriveBackup() {
	}

	public DriveBackup(java.lang.String jobId, java.lang.String device, java.lang.String target, java.lang.String format, MirrorSyncMode sync, NewImageMode mode, java.lang.Long speed, java.lang.String bitmap, java.lang.Boolean compress, BlockdevOnError onSourceError, BlockdevOnError onTargetError, java.lang.Boolean autoFinalize, java.lang.Boolean autoDismiss) {
		this.jobId = jobId;
		this.device = device;
		this.target = target;
		this.format = format;
		this.sync = sync;
		this.mode = mode;
		this.speed = speed;
		this.bitmap = bitmap;
		this.compress = compress;
		this.onSourceError = onSourceError;
		this.onTargetError = onTargetError;
		this.autoFinalize = autoFinalize;
		this.autoDismiss = autoDismiss;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("job-id");
		names.add("device");
		names.add("target");
		names.add("format");
		names.add("sync");
		names.add("mode");
		names.add("speed");
		names.add("bitmap");
		names.add("compress");
		names.add("on-source-error");
		names.add("on-target-error");
		names.add("auto-finalize");
		names.add("auto-dismiss");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("job-id".equals(name))
			return jobId;
		if ("device".equals(name))
			return device;
		if ("target".equals(name))
			return target;
		if ("format".equals(name))
			return format;
		if ("sync".equals(name))
			return sync;
		if ("mode".equals(name))
			return mode;
		if ("speed".equals(name))
			return speed;
		if ("bitmap".equals(name))
			return bitmap;
		if ("compress".equals(name))
			return compress;
		if ("on-source-error".equals(name))
			return onSourceError;
		if ("on-target-error".equals(name))
			return onTargetError;
		if ("auto-finalize".equals(name))
			return autoFinalize;
		if ("auto-dismiss".equals(name))
			return autoDismiss;
		return super.getFieldByName(name);
	}
}
