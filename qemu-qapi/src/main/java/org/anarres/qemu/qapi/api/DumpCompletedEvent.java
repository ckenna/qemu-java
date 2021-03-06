package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=DUMP_COMPLETED, data={result=DumpQueryResult, *error=str}}</pre>
 */
// QApiEventDescriptor{name=DUMP_COMPLETED, data={result=DumpQueryResult, *error=str}}
public class DumpCompletedEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("result")
		@Nonnull
		public DumpQueryResult result;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("error")
		@CheckForNull
		public java.lang.String error;
	}

	@JsonProperty("data")
	public Data data;
}
