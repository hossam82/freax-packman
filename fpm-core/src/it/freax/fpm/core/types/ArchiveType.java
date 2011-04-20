package it.freax.fpm.core.types;

/**
 * Specifica il tipo di archivio del Tarball
 * 
 * @author kLeZ-hAcK
 */
public enum ArchiveType
{
	/**
	 * Tipo di archivio Zip
	 */
	Zip,
	/**
	 * Tipo di archivio Tar compresso con GZip
	 */
	GZip,
	/**
	 * Tipo di archivio Tar compresso con BZip2
	 */
	BZip2,
	/**
	 * Ogni altro file che non è compreso
	 * tra i tipi di archivio supportati
	 */
	Unsupported
}
