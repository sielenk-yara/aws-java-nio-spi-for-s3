/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package software.amazon.nio.spi.s3;

import java.io.IOException;
import java.net.URI;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;

public abstract class S3FileSystemProvider extends FileSystemProvider {

    @Override
    public abstract S3FileSystem newFileSystem(URI uri, Map<String, ?> env) throws IOException;

    @Override
    public abstract S3FileSystem getFileSystem(URI uri);

    @Override
    public abstract S3Path getPath(URI uri);
}
