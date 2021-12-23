document.getElementById("boomerang-btn").addEventListener("click", boomerangsTest);
document.getElementById("loneOnes-btn").addEventListener("click", loneOnesTest);

function boomerangsTest()
{
    if (countBoomerangs([9, 5, 9, 5, 1, 1, 1]) === 2)
    {
        console.log("Test 1 successful");
    }
    if (countBoomerangs([5, 6, 6, 7, 6, 3, 9]) === 1)
    {
        console.log("Test 2 successful");
    }
    if (countBoomerangs([4, 4, 4, 9, 9, 9, 9]) === 0)
    {
        console.log("Test 3 successful");
    }
}

function countBoomerangs(numbers)
{
    let count = 0;
    let first = 0;

    for (let i=0; i<numbers.length; i++)
    {
        first = numbers[i];
        if (numbers[i+1] != first)
        {
            if (numbers[i+2] === first)
            {
                count++;
            }
        }
    }
    return count;
}

function loneOnesTest()
{
    if (countLoneOnes(101) === 2)
    {
        console.log("Test 1 successful")
    }
    if (countLoneOnes(1191) === 1)
    {
        console.log("Test 2 successful")
    }
    if (countLoneOnes(1111) === 0)
    {
        console.log("Test 3 successful")
    }
    if (countLoneOnes(462) === 0)
    {
        console.log("Test 4 successful")
    }
}

function countLoneOnes(number)
{
    let count = 0;
    let curDigit = ~~(number % 10);
    let remaining = ~~(number / 10);
    let digits = [];

    while (remaining != 0)
    {
        digits.push(curDigit);
        curDigit = ~~(remaining % 10);
        remaining = ~~(remaining / 10);
    }
    for (i=0;i<digits.length;i++)
    {
        // first check if we are at a 1
        if (digits[i] == 1)
        {
            // then check the next digit in the array
            if (digits[i + 1] == 1)
            {
                break;
            }
            else
            {
                if (digits[i-1] != 1)
                {
                    count++;
                }
            }
        }
    }

    console.log("This is count: " + count);
    return count;
}