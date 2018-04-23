package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=QKeyCode, data=[unmapped, shift, shift_r, alt, alt_r, ctrl, ctrl_r, menu, esc, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, minus, equal, backspace, tab, q, w, e, r, t, y, u, i, o, p, bracket_left, bracket_right, ret, a, s, d, f, g, h, j, k, l, semicolon, apostrophe, grave_accent, backslash, z, x, c, v, b, n, m, comma, dot, slash, asterisk, spc, caps_lock, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, num_lock, scroll_lock, kp_divide, kp_multiply, kp_subtract, kp_add, kp_enter, kp_decimal, sysrq, kp_0, kp_1, kp_2, kp_3, kp_4, kp_5, kp_6, kp_7, kp_8, kp_9, less, f11, f12, print, home, pgup, pgdn, end, left, up, down, right, insert, delete, stop, again, props, undo, front, copy, open, paste, find, cut, lf, help, meta_l, meta_r, compose, pause, ro, hiragana, henkan, yen, muhenkan, katakanahiragana, kp_comma, kp_equals, power, sleep, wake, audionext, audioprev, audiostop, audioplay, audiomute, volumeup, volumedown, mediaselect, mail, calculator, computer, ac_home, ac_back, ac_forward, ac_refresh, ac_bookmarks], fields=null}</pre>
 */
// QApiEnumDescriptor{name=QKeyCode, data=[unmapped, shift, shift_r, alt, alt_r, ctrl, ctrl_r, menu, esc, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, minus, equal, backspace, tab, q, w, e, r, t, y, u, i, o, p, bracket_left, bracket_right, ret, a, s, d, f, g, h, j, k, l, semicolon, apostrophe, grave_accent, backslash, z, x, c, v, b, n, m, comma, dot, slash, asterisk, spc, caps_lock, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, num_lock, scroll_lock, kp_divide, kp_multiply, kp_subtract, kp_add, kp_enter, kp_decimal, sysrq, kp_0, kp_1, kp_2, kp_3, kp_4, kp_5, kp_6, kp_7, kp_8, kp_9, less, f11, f12, print, home, pgup, pgdn, end, left, up, down, right, insert, delete, stop, again, props, undo, front, copy, open, paste, find, cut, lf, help, meta_l, meta_r, compose, pause, ro, hiragana, henkan, yen, muhenkan, katakanahiragana, kp_comma, kp_equals, power, sleep, wake, audionext, audioprev, audiostop, audioplay, audiomute, volumeup, volumedown, mediaselect, mail, calculator, computer, ac_home, ac_back, ac_forward, ac_refresh, ac_bookmarks], fields=null}
public enum QKeyCode {
	unmapped("unmapped"),
	shift("shift"),
	shift_r("shift_r"),
	alt("alt"),
	alt_r("alt_r"),
	ctrl("ctrl"),
	ctrl_r("ctrl_r"),
	menu("menu"),
	esc("esc"),
	VAL_1("1"),
	VAL_2("2"),
	VAL_3("3"),
	VAL_4("4"),
	VAL_5("5"),
	VAL_6("6"),
	VAL_7("7"),
	VAL_8("8"),
	VAL_9("9"),
	VAL_0("0"),
	minus("minus"),
	equal("equal"),
	backspace("backspace"),
	tab("tab"),
	q("q"),
	w("w"),
	e("e"),
	r("r"),
	t("t"),
	y("y"),
	u("u"),
	i("i"),
	o("o"),
	p("p"),
	bracket_left("bracket_left"),
	bracket_right("bracket_right"),
	ret("ret"),
	a("a"),
	s("s"),
	d("d"),
	f("f"),
	g("g"),
	h("h"),
	j("j"),
	k("k"),
	l("l"),
	semicolon("semicolon"),
	apostrophe("apostrophe"),
	grave_accent("grave_accent"),
	backslash("backslash"),
	z("z"),
	x("x"),
	c("c"),
	v("v"),
	b("b"),
	n("n"),
	m("m"),
	comma("comma"),
	dot("dot"),
	slash("slash"),
	asterisk("asterisk"),
	spc("spc"),
	caps_lock("caps_lock"),
	f1("f1"),
	f2("f2"),
	f3("f3"),
	f4("f4"),
	f5("f5"),
	f6("f6"),
	f7("f7"),
	f8("f8"),
	f9("f9"),
	f10("f10"),
	num_lock("num_lock"),
	scroll_lock("scroll_lock"),
	kp_divide("kp_divide"),
	kp_multiply("kp_multiply"),
	kp_subtract("kp_subtract"),
	kp_add("kp_add"),
	kp_enter("kp_enter"),
	kp_decimal("kp_decimal"),
	sysrq("sysrq"),
	kp_0("kp_0"),
	kp_1("kp_1"),
	kp_2("kp_2"),
	kp_3("kp_3"),
	kp_4("kp_4"),
	kp_5("kp_5"),
	kp_6("kp_6"),
	kp_7("kp_7"),
	kp_8("kp_8"),
	kp_9("kp_9"),
	less("less"),
	f11("f11"),
	f12("f12"),
	print("print"),
	home("home"),
	pgup("pgup"),
	pgdn("pgdn"),
	end("end"),
	left("left"),
	up("up"),
	down("down"),
	right("right"),
	insert("insert"),
	delete("delete"),
	stop("stop"),
	again("again"),
	props("props"),
	undo("undo"),
	front("front"),
	copy("copy"),
	open("open"),
	paste("paste"),
	find("find"),
	cut("cut"),
	lf("lf"),
	help("help"),
	meta_l("meta_l"),
	meta_r("meta_r"),
	compose("compose"),
	pause("pause"),
	ro("ro"),
	hiragana("hiragana"),
	henkan("henkan"),
	yen("yen"),
	muhenkan("muhenkan"),
	katakanahiragana("katakanahiragana"),
	kp_comma("kp_comma"),
	kp_equals("kp_equals"),
	power("power"),
	sleep("sleep"),
	wake("wake"),
	audionext("audionext"),
	audioprev("audioprev"),
	audiostop("audiostop"),
	audioplay("audioplay"),
	audiomute("audiomute"),
	volumeup("volumeup"),
	volumedown("volumedown"),
	mediaselect("mediaselect"),
	mail("mail"),
	calculator("calculator"),
	computer("computer"),
	ac_home("ac_home"),
	ac_back("ac_back"),
	ac_forward("ac_forward"),
	ac_refresh("ac_refresh"),
	ac_bookmarks("ac_bookmarks"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ QKeyCode(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
