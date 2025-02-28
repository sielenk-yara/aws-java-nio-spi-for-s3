/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package software.amazon.nio.spi.s3;

import java.nio.file.FileSystem;

public abstract class S3FileSystem extends FileSystem {

    @Override
    public abstract S3FileSystemProvider provider();

    @Override
    public abstract S3Path getPath(String first, String... more);
}
