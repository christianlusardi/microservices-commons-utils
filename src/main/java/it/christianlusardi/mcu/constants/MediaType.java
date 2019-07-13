package it.christianlusardi.mcu.constants;

/**
 * An abstraction for a media type
 *
 * @author Chriistian Lusardi
 * @version 1.0
 * 
 */
public class MediaType {

	/**
	 * The media type {@code charset} parameter name.
	 */
	public static final String CHARSET_PARAMETER = "charset";

	/**
	 * The value of a type or subtype wildcard {@value #MEDIA_TYPE_WILDCARD}.
	 */
	public static final String MEDIA_TYPE_WILDCARD = "*";

	/**
	 * A {@code String} constant representing wildcard {@value #WILDCARD} media type
	 * .
	 */
	public static final String WILDCARD = "*/*";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_XML} media type.
	 */
	public static final String APPLICATION_XML = "application/xml";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_ATOM_XML} media
	 * type.
	 */
	public static final String APPLICATION_ATOM_XML = "application/atom+xml";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_XHTML_XML} media
	 * type.
	 */
	public static final String APPLICATION_XHTML_XML = "application/xhtml+xml";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_SVG_XML} media
	 * type.
	 */
	public static final String APPLICATION_SVG_XML = "application/svg+xml";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_JSON} media type.
	 */
	public static final String APPLICATION_JSON = "application/json";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_FORM_URLENCODED}
	 * media type.
	 */
	public static final String APPLICATION_FORM_URLENCODED = "application/x-www-form-urlencoded";

	/**
	 * A {@code String} constant representing {@value #MULTIPART_FORM_DATA} media
	 * type.
	 */
	public static final String MULTIPART_FORM_DATA = "multipart/form-data";

	/**
	 * A {@code String} constant representing {@value #APPLICATION_OCTET_STREAM}
	 * media type.
	 */
	public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

	/**
	 * A {@code String} constant representing {@value #TEXT_PLAIN} media type.
	 */
	public static final String TEXT_PLAIN = "text/plain";

	/**
	 * A {@code String} constant representing {@value #TEXT_XML} media type.
	 */
	public static final String TEXT_XML = "text/xml";

	/**
	 * A {@code String} constant representing {@value #TEXT_HTML} media type.
	 */
	public static final String TEXT_HTML = "text/html";

	/**
	 * {@link String} representation of Server sent events media type. ("{@value}").
	 */
	public static final String SERVER_SENT_EVENTS = "text/event-stream";

	/**
	 * {@link String} representation of {@value #APPLICATION_JSON_PATCH_JSON} media
	 * type..
	 */
	public static final String APPLICATION_JSON_PATCH_JSON = "application/json-patch+json";

	/**
	 * Private constructor for an utility class
	 */
	private MediaType() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

}
