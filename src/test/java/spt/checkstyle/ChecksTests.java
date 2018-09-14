/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package spt.checkstyle;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.xml.sax.SAXException;

/**
 * {@link Test}: Checks
 */
public class ChecksTests {
	
	/**
	 * {@link javax.xml.parsers.DocumentBuilder#parse(java.io.InputStream)}
	 */
	@Test
	public void parse() {
		
		try {
			
			DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.parse(new ClassPathResource("spt/checkstyle/checks.xml").getInputStream());
		}
		catch (ParserConfigurationException | SAXException | IOException e) {
			
			throw new IllegalStateException(e);
		}
	}
}
