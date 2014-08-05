package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=MigrationStats, data={transferred=int, remaining=int, total=int, duplicate=int, skipped=int, normal=int, normal-bytes=int, dirty-pages-rate=int, mbps=number, dirty-sync-count=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=MigrationStats, data={transferred=int, remaining=int, total=int, duplicate=int, skipped=int, normal=int, normal-bytes=int, dirty-pages-rate=int, mbps=number, dirty-sync-count=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MigrationStats extends QApiType {

	@JsonProperty("transferred")
	@Nonnull
	public long transferred;
	@JsonProperty("remaining")
	@Nonnull
	public long remaining;
	@JsonProperty("total")
	@Nonnull
	public long total;
	@JsonProperty("duplicate")
	@Nonnull
	public long duplicate;
	@JsonProperty("skipped")
	@Nonnull
	public long skipped;
	@JsonProperty("normal")
	@Nonnull
	public long normal;
	@JsonProperty("normal-bytes")
	@Nonnull
	public long normalBytes;
	@JsonProperty("dirty-pages-rate")
	@Nonnull
	public long dirtyPagesRate;
	@JsonProperty("mbps")
	@Nonnull
	public double mbps;
	@JsonProperty("dirty-sync-count")
	@Nonnull
	public long dirtySyncCount;

	@Nonnull
	public MigrationStats withTransferred(long value) {
		this.transferred = value;
		return this;
	}

	@Nonnull
	public MigrationStats withRemaining(long value) {
		this.remaining = value;
		return this;
	}

	@Nonnull
	public MigrationStats withTotal(long value) {
		this.total = value;
		return this;
	}

	@Nonnull
	public MigrationStats withDuplicate(long value) {
		this.duplicate = value;
		return this;
	}

	@Nonnull
	public MigrationStats withSkipped(long value) {
		this.skipped = value;
		return this;
	}

	@Nonnull
	public MigrationStats withNormal(long value) {
		this.normal = value;
		return this;
	}

	@Nonnull
	public MigrationStats withNormalBytes(long value) {
		this.normalBytes = value;
		return this;
	}

	@Nonnull
	public MigrationStats withDirtyPagesRate(long value) {
		this.dirtyPagesRate = value;
		return this;
	}

	@Nonnull
	public MigrationStats withMbps(double value) {
		this.mbps = value;
		return this;
	}

	@Nonnull
	public MigrationStats withDirtySyncCount(long value) {
		this.dirtySyncCount = value;
		return this;
	}

	public MigrationStats() {
	}

	public MigrationStats(long transferred, long remaining, long total, long duplicate, long skipped, long normal, long normalBytes, long dirtyPagesRate, double mbps, long dirtySyncCount) {
		this.transferred = transferred;
		this.remaining = remaining;
		this.total = total;
		this.duplicate = duplicate;
		this.skipped = skipped;
		this.normal = normal;
		this.normalBytes = normalBytes;
		this.dirtyPagesRate = dirtyPagesRate;
		this.mbps = mbps;
		this.dirtySyncCount = dirtySyncCount;
	}
}
