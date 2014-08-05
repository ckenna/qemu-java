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
 * <p><pre>QApiTypeDescriptor{name=BlockdevOptionsQuorum, data={*blkverify=bool, children=[BlockdevRef], vote-threshold=int, *rewrite-corrupted=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevOptionsQuorum, data={*blkverify=bool, children=[BlockdevRef], vote-threshold=int, *rewrite-corrupted=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsQuorum extends QApiType {

	@JsonProperty("blkverify")
	@CheckForNull
	public java.lang.Boolean blkverify;
	@JsonProperty("children")
	@Nonnull
	public java.util.List<BlockdevRef> children;
	@JsonProperty("vote-threshold")
	@Nonnull
	public long voteThreshold;
	@JsonProperty("rewrite-corrupted")
	@CheckForNull
	public java.lang.Boolean rewriteCorrupted;

	@Nonnull
	public BlockdevOptionsQuorum withBlkverify(java.lang.Boolean value) {
		this.blkverify = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withChildren(java.util.List<BlockdevRef> value) {
		this.children = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withVoteThreshold(long value) {
		this.voteThreshold = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQuorum withRewriteCorrupted(java.lang.Boolean value) {
		this.rewriteCorrupted = value;
		return this;
	}

	public BlockdevOptionsQuorum() {
	}

	public BlockdevOptionsQuorum(java.lang.Boolean blkverify, java.util.List<BlockdevRef> children, long voteThreshold, java.lang.Boolean rewriteCorrupted) {
		this.blkverify = blkverify;
		this.children = children;
		this.voteThreshold = voteThreshold;
		this.rewriteCorrupted = rewriteCorrupted;
	}
}