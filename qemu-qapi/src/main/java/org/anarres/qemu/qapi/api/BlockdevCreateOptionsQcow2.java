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
 * <pre>QApiStructDescriptor{name=BlockdevCreateOptionsQcow2, data={file=BlockdevRef, size=size, *version=BlockdevQcow2Version, *backing-file=str, *backing-fmt=BlockdevDriver, *encrypt=QCryptoBlockCreateOptions, *cluster-size=size, *preallocation=PreallocMode, *lazy-refcounts=bool, *refcount-bits=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockdevCreateOptionsQcow2, data={file=BlockdevRef, size=size, *version=BlockdevQcow2Version, *backing-file=str, *backing-fmt=BlockdevDriver, *encrypt=QCryptoBlockCreateOptions, *cluster-size=size, *preallocation=PreallocMode, *lazy-refcounts=bool, *refcount-bits=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevCreateOptionsQcow2 extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("file")
	@Nonnull
	public BlockdevRef file;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("size")
	@Nonnull
	public long size;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("version")
	@CheckForNull
	public BlockdevQcow2Version version;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing-file")
	@CheckForNull
	public java.lang.String backingFile;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing-fmt")
	@CheckForNull
	public BlockdevDriver backingFmt;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("encrypt")
	@CheckForNull
	public QCryptoBlockCreateOptions encrypt;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cluster-size")
	@CheckForNull
	public java.lang.Long clusterSize;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("preallocation")
	@CheckForNull
	public PreallocMode preallocation;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("lazy-refcounts")
	@CheckForNull
	public java.lang.Boolean lazyRefcounts;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("refcount-bits")
	@CheckForNull
	public java.lang.Long refcountBits;

	@Nonnull
	public BlockdevCreateOptionsQcow2 withFile(BlockdevRef value) {
		this.file = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withSize(long value) {
		this.size = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withVersion(BlockdevQcow2Version value) {
		this.version = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withBackingFile(java.lang.String value) {
		this.backingFile = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withBackingFmt(BlockdevDriver value) {
		this.backingFmt = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withEncrypt(QCryptoBlockCreateOptions value) {
		this.encrypt = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withClusterSize(java.lang.Long value) {
		this.clusterSize = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withPreallocation(PreallocMode value) {
		this.preallocation = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withLazyRefcounts(java.lang.Boolean value) {
		this.lazyRefcounts = value;
		return this;
	}

	@Nonnull
	public BlockdevCreateOptionsQcow2 withRefcountBits(java.lang.Long value) {
		this.refcountBits = value;
		return this;
	}

	public BlockdevCreateOptionsQcow2() {
	}

	public BlockdevCreateOptionsQcow2(BlockdevRef file, long size, BlockdevQcow2Version version, java.lang.String backingFile, BlockdevDriver backingFmt, QCryptoBlockCreateOptions encrypt, java.lang.Long clusterSize, PreallocMode preallocation, java.lang.Boolean lazyRefcounts, java.lang.Long refcountBits) {
		this.file = file;
		this.size = size;
		this.version = version;
		this.backingFile = backingFile;
		this.backingFmt = backingFmt;
		this.encrypt = encrypt;
		this.clusterSize = clusterSize;
		this.preallocation = preallocation;
		this.lazyRefcounts = lazyRefcounts;
		this.refcountBits = refcountBits;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("file");
		names.add("size");
		names.add("version");
		names.add("backing-file");
		names.add("backing-fmt");
		names.add("encrypt");
		names.add("cluster-size");
		names.add("preallocation");
		names.add("lazy-refcounts");
		names.add("refcount-bits");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("file".equals(name))
			return file;
		if ("size".equals(name))
			return size;
		if ("version".equals(name))
			return version;
		if ("backing-file".equals(name))
			return backingFile;
		if ("backing-fmt".equals(name))
			return backingFmt;
		if ("encrypt".equals(name))
			return encrypt;
		if ("cluster-size".equals(name))
			return clusterSize;
		if ("preallocation".equals(name))
			return preallocation;
		if ("lazy-refcounts".equals(name))
			return lazyRefcounts;
		if ("refcount-bits".equals(name))
			return refcountBits;
		return super.getFieldByName(name);
	}
}
