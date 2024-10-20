const fs = require('fs');
const { OpenAI } = require('openai');
const Anthropic = require("@anthropic-ai/sdk");
const axios = require('axios');
const { Mistral } = require("@mistralai/mistralai");



const promptset = '../Promptset1/Prompt3';
const prompt = fs.readFileSync(promptset + '/Prompt.md', 'utf-8');


async function getResponseGPT4o() {
  try {
    const startTime = Date.now();
    const response = await openai.chat.completions.create({
      model: 'gpt-4o',
      messages: [{ role: 'user', content: prompt }],
    });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content = response.choices[0].message.content;

    fs.writeFile(promptset + '/responses/response_GPT4o.html', content, (err) => {
      if (err) throw err;
      console.log('GPT4o response saved to response_GPT4o.html');
      console.log(`GPT4o response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching OpenAI response:', error.message);
  }
}
async function getResponseGPT4omini() {
  try {
    const startTime = Date.now();
    const response = await openai.chat.completions.create({
      model: 'gpt-4o-mini',
      messages: [{ role: 'user', content: prompt }],
    });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content = response.choices[0].message.content;

    fs.writeFile(promptset + '/responses/response_GPT4omini.html', content, (err) => {
      if (err) throw err;
      console.log('GPT4o-mini response saved to response_GPT4omini.html');
      console.log(`GPT4o-mini response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching OpenAI response:', error.message);
  }
}

async function getResponseClaudeHaiku() {
  try {
    const startTime = Date.now();
    const response = await anthopic.messages.create({
        model: "claude-3-haiku-20240307",
        max_tokens: 4096,
        messages: [{ role: "user", content: prompt}],
     });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content = response.content[0].text;

    fs.writeFile(promptset + '/responses/response_claudehaiku.html', content, (err) => {
      if (err) throw err;
      console.log('Claude Haiku response saved to response_claudehaiku.html');
      console.log(`Claude Haiku response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Claude response:', error.message);
  }
}

async function getResponseClaude() {
  try {
    const startTime = Date.now();
    const response = await anthopic.messages.create({
        model: "claude-3-5-sonnet-20240620",
        max_tokens: 8192,
        messages: [{ role: "user", content: prompt}],
     });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content = response.content[0].text;

    fs.writeFile(promptset + '/responses/response_claude.html', content, (err) => {
      if (err) throw err;
      console.log('Claude Sonnet response saved to response_claude.html');
      console.log(`Claude Sonnet response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Claude response:', error.message);
  }
}

async function getResponseMistralLarge() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "ft:open-mistral-7b:229c75b9:20241019:ce30be5c",
        messages: [
          {
            content: prompt,
            role: "system",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_mistrallarge.html', content, (err) => {
      if (err) throw err;
      console.log('Mistral Large response saved to response_mistrallarge.html');
      console.log(`Mistral Large response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}


async function getResponseCodestral() {
  try {
    const startTime = Date.now();
    const response = await mistral.chat.complete({
        model: "codestral-2405",
        messages: [
          {
            content: prompt,
            role: "system",
          },
        ],
      });
    const endTime = Date.now();
    const responseTime = endTime - startTime;
    const content =
      response.choices[0].message.content;
    fs.writeFile(promptset + '/responses/response_codestral.html', content, (err) => {
      if (err) throw err;
      console.log('Codestral response saved to response_codestral.html');
      console.log(`Codestral response time: ${responseTime} ms`);
    });
  } catch (error) {
    console.error('Error fetching Mistral response:', error.message);
  }
}



getResponseGPT4o();
//getResponseGPT4omini();
//getResponseClaude();
//getResponseClaudeHaiku();
getResponseMistralLarge();
//getResponseCodestral();
