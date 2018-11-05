package example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class TestCase
{
	public static void testCase(Path path) throws Exception
	{
		var list = new ArrayList<Path>();
		try (var stream = Files.newDirectoryStream(path))
		{
			stream.forEach(((list::add));
		}
	}
}
