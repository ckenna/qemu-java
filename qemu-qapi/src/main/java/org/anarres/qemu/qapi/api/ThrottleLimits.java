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
 * <pre>QApiStructDescriptor{name=ThrottleLimits, data={*iops-total=int, *iops-total-max=int, *iops-total-max-length=int, *iops-read=int, *iops-read-max=int, *iops-read-max-length=int, *iops-write=int, *iops-write-max=int, *iops-write-max-length=int, *bps-total=int, *bps-total-max=int, *bps-total-max-length=int, *bps-read=int, *bps-read-max=int, *bps-read-max-length=int, *bps-write=int, *bps-write-max=int, *bps-write-max-length=int, *iops-size=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=ThrottleLimits, data={*iops-total=int, *iops-total-max=int, *iops-total-max-length=int, *iops-read=int, *iops-read-max=int, *iops-read-max-length=int, *iops-write=int, *iops-write-max=int, *iops-write-max-length=int, *bps-total=int, *bps-total-max=int, *bps-total-max-length=int, *bps-read=int, *bps-read-max=int, *bps-read-max-length=int, *bps-write=int, *bps-write-max=int, *bps-write-max-length=int, *iops-size=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ThrottleLimits extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-total")
	@CheckForNull
	public java.lang.Long iopsTotal;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-total-max")
	@CheckForNull
	public java.lang.Long iopsTotalMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-total-max-length")
	@CheckForNull
	public java.lang.Long iopsTotalMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-read")
	@CheckForNull
	public java.lang.Long iopsRead;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-read-max")
	@CheckForNull
	public java.lang.Long iopsReadMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-read-max-length")
	@CheckForNull
	public java.lang.Long iopsReadMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-write")
	@CheckForNull
	public java.lang.Long iopsWrite;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-write-max")
	@CheckForNull
	public java.lang.Long iopsWriteMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-write-max-length")
	@CheckForNull
	public java.lang.Long iopsWriteMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-total")
	@CheckForNull
	public java.lang.Long bpsTotal;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-total-max")
	@CheckForNull
	public java.lang.Long bpsTotalMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-total-max-length")
	@CheckForNull
	public java.lang.Long bpsTotalMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-read")
	@CheckForNull
	public java.lang.Long bpsRead;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-read-max")
	@CheckForNull
	public java.lang.Long bpsReadMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-read-max-length")
	@CheckForNull
	public java.lang.Long bpsReadMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-write")
	@CheckForNull
	public java.lang.Long bpsWrite;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-write-max")
	@CheckForNull
	public java.lang.Long bpsWriteMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps-write-max-length")
	@CheckForNull
	public java.lang.Long bpsWriteMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops-size")
	@CheckForNull
	public java.lang.Long iopsSize;

	@Nonnull
	public ThrottleLimits withIopsTotal(java.lang.Long value) {
		this.iopsTotal = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsTotalMax(java.lang.Long value) {
		this.iopsTotalMax = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsTotalMaxLength(java.lang.Long value) {
		this.iopsTotalMaxLength = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsRead(java.lang.Long value) {
		this.iopsRead = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsReadMax(java.lang.Long value) {
		this.iopsReadMax = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsReadMaxLength(java.lang.Long value) {
		this.iopsReadMaxLength = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsWrite(java.lang.Long value) {
		this.iopsWrite = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsWriteMax(java.lang.Long value) {
		this.iopsWriteMax = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsWriteMaxLength(java.lang.Long value) {
		this.iopsWriteMaxLength = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsTotal(java.lang.Long value) {
		this.bpsTotal = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsTotalMax(java.lang.Long value) {
		this.bpsTotalMax = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsTotalMaxLength(java.lang.Long value) {
		this.bpsTotalMaxLength = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsRead(java.lang.Long value) {
		this.bpsRead = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsReadMax(java.lang.Long value) {
		this.bpsReadMax = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsReadMaxLength(java.lang.Long value) {
		this.bpsReadMaxLength = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsWrite(java.lang.Long value) {
		this.bpsWrite = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsWriteMax(java.lang.Long value) {
		this.bpsWriteMax = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withBpsWriteMaxLength(java.lang.Long value) {
		this.bpsWriteMaxLength = value;
		return this;
	}

	@Nonnull
	public ThrottleLimits withIopsSize(java.lang.Long value) {
		this.iopsSize = value;
		return this;
	}

	public ThrottleLimits() {
	}

	public ThrottleLimits(java.lang.Long iopsTotal, java.lang.Long iopsTotalMax, java.lang.Long iopsTotalMaxLength, java.lang.Long iopsRead, java.lang.Long iopsReadMax, java.lang.Long iopsReadMaxLength, java.lang.Long iopsWrite, java.lang.Long iopsWriteMax, java.lang.Long iopsWriteMaxLength, java.lang.Long bpsTotal, java.lang.Long bpsTotalMax, java.lang.Long bpsTotalMaxLength, java.lang.Long bpsRead, java.lang.Long bpsReadMax, java.lang.Long bpsReadMaxLength, java.lang.Long bpsWrite, java.lang.Long bpsWriteMax, java.lang.Long bpsWriteMaxLength, java.lang.Long iopsSize) {
		this.iopsTotal = iopsTotal;
		this.iopsTotalMax = iopsTotalMax;
		this.iopsTotalMaxLength = iopsTotalMaxLength;
		this.iopsRead = iopsRead;
		this.iopsReadMax = iopsReadMax;
		this.iopsReadMaxLength = iopsReadMaxLength;
		this.iopsWrite = iopsWrite;
		this.iopsWriteMax = iopsWriteMax;
		this.iopsWriteMaxLength = iopsWriteMaxLength;
		this.bpsTotal = bpsTotal;
		this.bpsTotalMax = bpsTotalMax;
		this.bpsTotalMaxLength = bpsTotalMaxLength;
		this.bpsRead = bpsRead;
		this.bpsReadMax = bpsReadMax;
		this.bpsReadMaxLength = bpsReadMaxLength;
		this.bpsWrite = bpsWrite;
		this.bpsWriteMax = bpsWriteMax;
		this.bpsWriteMaxLength = bpsWriteMaxLength;
		this.iopsSize = iopsSize;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("iops-total");
		names.add("iops-total-max");
		names.add("iops-total-max-length");
		names.add("iops-read");
		names.add("iops-read-max");
		names.add("iops-read-max-length");
		names.add("iops-write");
		names.add("iops-write-max");
		names.add("iops-write-max-length");
		names.add("bps-total");
		names.add("bps-total-max");
		names.add("bps-total-max-length");
		names.add("bps-read");
		names.add("bps-read-max");
		names.add("bps-read-max-length");
		names.add("bps-write");
		names.add("bps-write-max");
		names.add("bps-write-max-length");
		names.add("iops-size");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("iops-total".equals(name))
			return iopsTotal;
		if ("iops-total-max".equals(name))
			return iopsTotalMax;
		if ("iops-total-max-length".equals(name))
			return iopsTotalMaxLength;
		if ("iops-read".equals(name))
			return iopsRead;
		if ("iops-read-max".equals(name))
			return iopsReadMax;
		if ("iops-read-max-length".equals(name))
			return iopsReadMaxLength;
		if ("iops-write".equals(name))
			return iopsWrite;
		if ("iops-write-max".equals(name))
			return iopsWriteMax;
		if ("iops-write-max-length".equals(name))
			return iopsWriteMaxLength;
		if ("bps-total".equals(name))
			return bpsTotal;
		if ("bps-total-max".equals(name))
			return bpsTotalMax;
		if ("bps-total-max-length".equals(name))
			return bpsTotalMaxLength;
		if ("bps-read".equals(name))
			return bpsRead;
		if ("bps-read-max".equals(name))
			return bpsReadMax;
		if ("bps-read-max-length".equals(name))
			return bpsReadMaxLength;
		if ("bps-write".equals(name))
			return bpsWrite;
		if ("bps-write-max".equals(name))
			return bpsWriteMax;
		if ("bps-write-max-length".equals(name))
			return bpsWriteMaxLength;
		if ("iops-size".equals(name))
			return iopsSize;
		return super.getFieldByName(name);
	}
}
