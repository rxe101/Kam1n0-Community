/*******************************************************************************
 * Copyright 2017 McGill University All rights reserved.
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
 *******************************************************************************/
package ca.mcgill.sis.dmas.kam1n0.utils.src;

import java.util.ArrayList;
import java.util.HashSet;

import ca.mcgill.sis.dmas.env.StringResources;
import ca.mcgill.sis.dmas.io.collection.EntryPair;
import ca.mcgill.sis.dmas.kam1n0.utils.hash.HashUtils;

public class SrcFunction {

	public String binaryName = StringResources.STR_EMPTY;
	public String fileName = StringResources.STR_EMPTY;
	public String functionName = StringResources.STR_EMPTY;
	public ArrayList<String> content = new ArrayList<>();
	public HashSet<EntryPair<Long, Double>> clones = new HashSet<>();
	public String injectedID = StringResources.STR_EMPTY;
	public long id = -1;
	public int s_index = 0;
	public int e_index = 0;
	public long asmBlockID = -1;
	public long asmFuncID = -1;

	public void createID() {
		id = HashUtils.constructID(binaryName.getBytes(), fileName.getBytes(),
				functionName.getBytes());
	}

	@Override
	public String toString() {
		return StringResources.JOINER_TOKEN.join(binaryName, functionName);
	}
}
