/*
 *  Copyright 2011 Benjamin Glatzel.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package octree;

import blockmania.Chunk;
import java.util.HashSet;

/**
 * Octree as shown in the book "Physically Based Rendering".
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class OctNode {

    OctNode children[] = new OctNode[8];
    HashSet<Chunk> data = new HashSet<Chunk>();

    OctNode() {
        for (int i = 0; i < 8; ++i) {
            children[i] = null;
        }
    }
}
