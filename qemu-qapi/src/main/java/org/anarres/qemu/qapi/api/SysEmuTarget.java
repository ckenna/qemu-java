package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=SysEmuTarget, data=[aarch64, alpha, arm, cris, hppa, i386, lm32, m68k, microblaze, microblazeel, mips, mips64, mips64el, mipsel, moxie, nios2, or1k, ppc, ppc64, ppcemb, riscv32, riscv64, s390x, sh4, sh4eb, sparc, sparc64, tricore, unicore32, x86_64, xtensa, xtensaeb], fields=null}</pre>
 */
// QApiEnumDescriptor{name=SysEmuTarget, data=[aarch64, alpha, arm, cris, hppa, i386, lm32, m68k, microblaze, microblazeel, mips, mips64, mips64el, mipsel, moxie, nios2, or1k, ppc, ppc64, ppcemb, riscv32, riscv64, s390x, sh4, sh4eb, sparc, sparc64, tricore, unicore32, x86_64, xtensa, xtensaeb], fields=null}
public enum SysEmuTarget {
	aarch64("aarch64"),
	alpha("alpha"),
	arm("arm"),
	cris("cris"),
	hppa("hppa"),
	i386("i386"),
	lm32("lm32"),
	m68k("m68k"),
	microblaze("microblaze"),
	microblazeel("microblazeel"),
	mips("mips"),
	mips64("mips64"),
	mips64el("mips64el"),
	mipsel("mipsel"),
	moxie("moxie"),
	nios2("nios2"),
	or1k("or1k"),
	ppc("ppc"),
	ppc64("ppc64"),
	ppcemb("ppcemb"),
	riscv32("riscv32"),
	riscv64("riscv64"),
	s390x("s390x"),
	sh4("sh4"),
	sh4eb("sh4eb"),
	sparc("sparc"),
	sparc64("sparc64"),
	tricore("tricore"),
	unicore32("unicore32"),
	x86_64("x86_64"),
	xtensa("xtensa"),
	xtensaeb("xtensaeb"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ SysEmuTarget(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}