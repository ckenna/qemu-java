package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=BlockDeviceInfo, data={file=str, *node-name=str, ro=bool, drv=str, *backing_file=str, backing_file_depth=int, encrypted=bool, encryption_key_missing=bool, detect_zeroes=BlockdevDetectZeroesOptions, bps=int, bps_rd=int, bps_wr=int, iops=int, iops_rd=int, iops_wr=int, image=ImageInfo, *bps_max=int, *bps_rd_max=int, *bps_wr_max=int, *iops_max=int, *iops_rd_max=int, *iops_wr_max=int, *iops_size=int, cache=BlockdevCacheInfo, write_threshold=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockDeviceInfo, data={file=str, *node-name=str, ro=bool, drv=str, *backing_file=str, backing_file_depth=int, encrypted=bool, encryption_key_missing=bool, detect_zeroes=BlockdevDetectZeroesOptions, bps=int, bps_rd=int, bps_wr=int, iops=int, iops_rd=int, iops_wr=int, image=ImageInfo, *bps_max=int, *bps_rd_max=int, *bps_wr_max=int, *iops_max=int, *iops_rd_max=int, *iops_wr_max=int, *iops_size=int, cache=BlockdevCacheInfo, write_threshold=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockDeviceInfo extends QApiType {

	@JsonProperty("file")
	@Nonnull
	public java.lang.String file;
	@JsonProperty("node-name")
	@CheckForNull
	public java.lang.String nodeName;
	@JsonProperty("ro")
	@Nonnull
	public boolean ro;
	@JsonProperty("drv")
	@Nonnull
	public java.lang.String drv;
	@JsonProperty("backing_file")
	@CheckForNull
	public java.lang.String backingFile;
	@JsonProperty("backing_file_depth")
	@Nonnull
	public long backingFileDepth;
	@JsonProperty("encrypted")
	@Nonnull
	public boolean encrypted;
	@JsonProperty("encryption_key_missing")
	@Nonnull
	public boolean encryptionKeyMissing;
	@JsonProperty("detect_zeroes")
	@Nonnull
	public BlockdevDetectZeroesOptions detectZeroes;
	@JsonProperty("bps")
	@Nonnull
	public long bps;
	@JsonProperty("bps_rd")
	@Nonnull
	public long bpsRd;
	@JsonProperty("bps_wr")
	@Nonnull
	public long bpsWr;
	@JsonProperty("iops")
	@Nonnull
	public long iops;
	@JsonProperty("iops_rd")
	@Nonnull
	public long iopsRd;
	@JsonProperty("iops_wr")
	@Nonnull
	public long iopsWr;
	@JsonProperty("image")
	@Nonnull
	public ImageInfo image;
	@JsonProperty("bps_max")
	@CheckForNull
	public java.lang.Long bpsMax;
	@JsonProperty("bps_rd_max")
	@CheckForNull
	public java.lang.Long bpsRdMax;
	@JsonProperty("bps_wr_max")
	@CheckForNull
	public java.lang.Long bpsWrMax;
	@JsonProperty("iops_max")
	@CheckForNull
	public java.lang.Long iopsMax;
	@JsonProperty("iops_rd_max")
	@CheckForNull
	public java.lang.Long iopsRdMax;
	@JsonProperty("iops_wr_max")
	@CheckForNull
	public java.lang.Long iopsWrMax;
	@JsonProperty("iops_size")
	@CheckForNull
	public java.lang.Long iopsSize;
	@JsonProperty("cache")
	@Nonnull
	public BlockdevCacheInfo cache;
	@JsonProperty("write_threshold")
	@Nonnull
	public long writeThreshold;

	@Nonnull
	public BlockDeviceInfo withFile(java.lang.String value) {
		this.file = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withNodeName(java.lang.String value) {
		this.nodeName = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withRo(boolean value) {
		this.ro = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withDrv(java.lang.String value) {
		this.drv = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBackingFile(java.lang.String value) {
		this.backingFile = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBackingFileDepth(long value) {
		this.backingFileDepth = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withEncrypted(boolean value) {
		this.encrypted = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withEncryptionKeyMissing(boolean value) {
		this.encryptionKeyMissing = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withDetectZeroes(BlockdevDetectZeroesOptions value) {
		this.detectZeroes = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBps(long value) {
		this.bps = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsRd(long value) {
		this.bpsRd = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsWr(long value) {
		this.bpsWr = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIops(long value) {
		this.iops = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsRd(long value) {
		this.iopsRd = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsWr(long value) {
		this.iopsWr = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withImage(ImageInfo value) {
		this.image = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsMax(java.lang.Long value) {
		this.bpsMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsRdMax(java.lang.Long value) {
		this.bpsRdMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsWrMax(java.lang.Long value) {
		this.bpsWrMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsMax(java.lang.Long value) {
		this.iopsMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsRdMax(java.lang.Long value) {
		this.iopsRdMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsWrMax(java.lang.Long value) {
		this.iopsWrMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsSize(java.lang.Long value) {
		this.iopsSize = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withCache(BlockdevCacheInfo value) {
		this.cache = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withWriteThreshold(long value) {
		this.writeThreshold = value;
		return this;
	}

	public BlockDeviceInfo() {
	}

	public BlockDeviceInfo(java.lang.String file, java.lang.String nodeName, boolean ro, java.lang.String drv, java.lang.String backingFile, long backingFileDepth, boolean encrypted, boolean encryptionKeyMissing, BlockdevDetectZeroesOptions detectZeroes, long bps, long bpsRd, long bpsWr, long iops, long iopsRd, long iopsWr, ImageInfo image, java.lang.Long bpsMax, java.lang.Long bpsRdMax, java.lang.Long bpsWrMax, java.lang.Long iopsMax, java.lang.Long iopsRdMax, java.lang.Long iopsWrMax, java.lang.Long iopsSize, BlockdevCacheInfo cache, long writeThreshold) {
		this.file = file;
		this.nodeName = nodeName;
		this.ro = ro;
		this.drv = drv;
		this.backingFile = backingFile;
		this.backingFileDepth = backingFileDepth;
		this.encrypted = encrypted;
		this.encryptionKeyMissing = encryptionKeyMissing;
		this.detectZeroes = detectZeroes;
		this.bps = bps;
		this.bpsRd = bpsRd;
		this.bpsWr = bpsWr;
		this.iops = iops;
		this.iopsRd = iopsRd;
		this.iopsWr = iopsWr;
		this.image = image;
		this.bpsMax = bpsMax;
		this.bpsRdMax = bpsRdMax;
		this.bpsWrMax = bpsWrMax;
		this.iopsMax = iopsMax;
		this.iopsRdMax = iopsRdMax;
		this.iopsWrMax = iopsWrMax;
		this.iopsSize = iopsSize;
		this.cache = cache;
		this.writeThreshold = writeThreshold;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("file");
		names.add("node-name");
		names.add("ro");
		names.add("drv");
		names.add("backing_file");
		names.add("backing_file_depth");
		names.add("encrypted");
		names.add("encryption_key_missing");
		names.add("detect_zeroes");
		names.add("bps");
		names.add("bps_rd");
		names.add("bps_wr");
		names.add("iops");
		names.add("iops_rd");
		names.add("iops_wr");
		names.add("image");
		names.add("bps_max");
		names.add("bps_rd_max");
		names.add("bps_wr_max");
		names.add("iops_max");
		names.add("iops_rd_max");
		names.add("iops_wr_max");
		names.add("iops_size");
		names.add("cache");
		names.add("write_threshold");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("file".equals(name))
			return file;
		if ("node-name".equals(name))
			return nodeName;
		if ("ro".equals(name))
			return ro;
		if ("drv".equals(name))
			return drv;
		if ("backing_file".equals(name))
			return backingFile;
		if ("backing_file_depth".equals(name))
			return backingFileDepth;
		if ("encrypted".equals(name))
			return encrypted;
		if ("encryption_key_missing".equals(name))
			return encryptionKeyMissing;
		if ("detect_zeroes".equals(name))
			return detectZeroes;
		if ("bps".equals(name))
			return bps;
		if ("bps_rd".equals(name))
			return bpsRd;
		if ("bps_wr".equals(name))
			return bpsWr;
		if ("iops".equals(name))
			return iops;
		if ("iops_rd".equals(name))
			return iopsRd;
		if ("iops_wr".equals(name))
			return iopsWr;
		if ("image".equals(name))
			return image;
		if ("bps_max".equals(name))
			return bpsMax;
		if ("bps_rd_max".equals(name))
			return bpsRdMax;
		if ("bps_wr_max".equals(name))
			return bpsWrMax;
		if ("iops_max".equals(name))
			return iopsMax;
		if ("iops_rd_max".equals(name))
			return iopsRdMax;
		if ("iops_wr_max".equals(name))
			return iopsWrMax;
		if ("iops_size".equals(name))
			return iopsSize;
		if ("cache".equals(name))
			return cache;
		if ("write_threshold".equals(name))
			return writeThreshold;
		return super.getFieldByName(name);
	}
}
