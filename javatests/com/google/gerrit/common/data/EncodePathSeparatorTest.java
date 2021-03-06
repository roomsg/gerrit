// Copyright (C) 2011 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.common.data;

import static com.google.common.truth.Truth.assertThat;

import com.google.gerrit.testing.GerritBaseTests;
import org.junit.Test;

public class EncodePathSeparatorTest extends GerritBaseTests {
  @Test
  public void defaultBehaviour() {
    assertThat(new GitwebType().replacePathSeparator("a/b")).isEqualTo("a/b");
  }

  @Test
  public void exclamationMark() {
    GitwebType gitwebType = new GitwebType();
    gitwebType.setPathSeparator('!');
    assertThat(gitwebType.replacePathSeparator("a/b")).isEqualTo("a!b");
  }
}
