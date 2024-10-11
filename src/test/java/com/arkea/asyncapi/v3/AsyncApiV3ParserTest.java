package com.arkea.asyncapi.v3;

import com.arkea.asyncapi.v3.models.AsyncAPI;
import com.arkea.asyncapi.v3.parser.AsyncAPIV3Parser;
import com.arkea.asyncapi.v3.parser.models.AsyncParseResult;
import com.arkea.asyncapi.v3.parser.models.ParseOptions;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class AsyncApiV3ParserTest {

	@Test
	public void testMinimalAsyncAPIV3Parser() {
		AsyncAPIV3Parser asyncAPIV3Parser = new AsyncAPIV3Parser();
		ParseOptions options = new ParseOptions();

		InputStream myStream = null;
		String myString = null;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			myStream = classloader.getResourceAsStream("v3/asyncapi.yaml");

			myString = IOUtils.toString(myStream, Charset.defaultCharset()).trim();
		} catch (Exception e) {			
			e.printStackTrace();
			fail(e.getMessage());
		}finally {
			if(myStream != null) {
				IOUtils.closeQuietly(myStream);
			}
		}

		options.setResolve(true);
		AsyncParseResult parseResult = asyncAPIV3Parser.readContents(myString);
		AsyncAPI asyncAPI = parseResult.getAsyncAPI();
		assertNotNull(asyncAPI);
		assertTrue(parseResult.getMessages().size() == 0);
	}

	@Test
	public void testM2AsyncAPIV3Parser() {
		AsyncAPIV3Parser asyncAPIV3Parser = new AsyncAPIV3Parser();
		ParseOptions options = new ParseOptions();

		InputStream myStream = null;
		String myString = null;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			myStream = classloader.getResourceAsStream("v3/application-headers.yml");
			myString = IOUtils.toString(myStream, Charset.defaultCharset()).trim();
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}finally {
			if(myStream != null) {
				IOUtils.closeQuietly(myStream);
			}
		}
		
		IOUtils.closeQuietly(myStream);
		

		options.setResolve(true);
		AsyncParseResult parseResult = asyncAPIV3Parser.readContents(myString);
		AsyncAPI asyncAPI = parseResult.getAsyncAPI();
		assertNotNull(asyncAPI);
		assertTrue(parseResult.getMessages().size() == 0);
		assertTrue(asyncAPI.getChannels().get("lightingMeasuredChannel").getExtensions().size() > 0);
	}

	@Test
	public void testJsonAsyncAPIV3Parser() {
		AsyncAPIV3Parser asyncAPIV3Parser = new AsyncAPIV3Parser();
		ParseOptions options = new ParseOptions();

		InputStream myStream = null;
		String myString = null;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			myStream = classloader.getResourceAsStream("v3/TestJson.json");
			myString = IOUtils.toString(myStream, Charset.defaultCharset()).trim();
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} finally {
			if(myStream != null) {
				IOUtils.closeQuietly(myStream);
			}
		}

		options.setResolve(true);
		AsyncParseResult parseResult = asyncAPIV3Parser.readContents(myString);
		AsyncAPI asyncAPI = parseResult.getAsyncAPI();
		assertNotNull(asyncAPI);
		assertTrue(parseResult.getMessages().size() == 0);
	}

	@Test
	public void testCloudEventsAsyncAPIV3Parser() {
		AsyncAPIV3Parser asyncAPIV3Parser = new AsyncAPIV3Parser();
		ParseOptions options = new ParseOptions();

		InputStream myStream = null;
		String myString = null;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			myStream = classloader.getResourceAsStream("v3/cloudEventsTest.yml");
			myString = IOUtils.toString(myStream, Charset.defaultCharset()).trim();
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}finally {
			if(myStream != null) {
				IOUtils.closeQuietly(myStream);
			}
		}

		options.setResolve(true);
		AsyncParseResult parseResult = asyncAPIV3Parser.readContents(myString);
		AsyncAPI asyncAPI = parseResult.getAsyncAPI();
		assertNotNull(asyncAPI);
		assertTrue(parseResult.getMessages().size() == 0);
		assertTrue(asyncAPI.getChannels().get("userSignupChannel").getExtensions().size() > 0);
		assertTrue(asyncAPI.getChannels().get("userSignupChannel").getExtensions().get("x-arkea") != null);

	}
	@Test
	public void testOneOfAsyncAPIV3Parser() {
		AsyncAPIV3Parser asyncAPIV3Parser = new AsyncAPIV3Parser();
		ParseOptions options = new ParseOptions();

		InputStream myStream = null;
		String myString = null;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			myStream = classloader.getResourceAsStream("v3/oneof.yml");
			myString = IOUtils.toString(myStream, Charset.defaultCharset()).trim();
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}finally {
			if(myStream != null) {
				IOUtils.closeQuietly(myStream);
			}
		}

		options.setResolve(true);
		AsyncParseResult parseResult = asyncAPIV3Parser.readContents(myString);
		AsyncAPI asyncAPI = parseResult.getAsyncAPI();
		assertNotNull(asyncAPI);
		assertTrue(parseResult.getMessages().size() == 0);
	}
}
