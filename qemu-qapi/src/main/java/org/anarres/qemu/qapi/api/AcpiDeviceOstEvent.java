package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=ACPI_DEVICE_OST, data={info=ACPIOSTInfo}}</pre>
 */
// QApiEventDescriptor{name=ACPI_DEVICE_OST, data={info=ACPIOSTInfo}}
public class AcpiDeviceOstEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("info")
		@Nonnull
		public ACPIOSTInfo info;
	}

	@JsonProperty("data")
	public Data data;
}
